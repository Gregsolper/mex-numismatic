package com.gregorio.numismatic.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.management.relation.RelationNotFoundException;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gregorio.numismatic.exception.ResourceNotFoundException;
import com.gregorio.numismatic.model.Coin;
import com.gregorio.numismatic.repository.CoinRepository;

@RestController
@RequestMapping ("/api/")
public class coinController {
	
	@Autowired
	private CoinRepository coinRepository;
	
	@GetMapping("coin")
	public List<Coin> getAllCoins() {		
		return this.coinRepository.findAll(); 
	}
	
	@GetMapping("coin/{id}")
	public ResponseEntity<Coin> getCoinId
			(@PathVariable(value="id") Long coinId) 
			throws ResourceNotFoundException  {		
		Coin coin =this.coinRepository.findById(coinId)
				.orElseThrow(()->
					new ResourceNotFoundException("No se encontró :: "+coinId));
		return ResponseEntity.ok().body(coin);
	}
	
	@PostMapping ("coin")
	public Coin createCoin (@RequestBody Coin coin) {
		return this.coinRepository.save(coin);
	}
	/**
	 * Update
	 * @param coinId
	 * @param coinDetails
	 * @return
	 * @throws ResourceNotFoundException,Exception 
	 */
	@PutMapping("coin/{id}")
	public ResponseEntity<Coin> updateCoin 
			(@PathVariable(value="id") Long coinId, 
			 @Valid @RequestBody Coin coinDetails) 
			throws ResourceNotFoundException{
		Coin coin =this.coinRepository.findById(coinId)
				.orElseThrow(()->
					new ResourceNotFoundException("No se encontró :: "+coinId));
		coin.setDiametro(coinDetails.getDiametro());
		
		return ResponseEntity.ok(this.coinRepository.save(coin));
		 
	}
	
	@DeleteMapping("coin/{id}")
	public Map<String,Boolean> deleteCoin (@PathVariable(value="id") Long coinId) throws ResourceNotFoundException{
		Coin coin =this.coinRepository.findById(coinId)
				.orElseThrow(()->
					new ResourceNotFoundException("No se encontró :: "+coinId));
		this.coinRepository.delete(coin);
		
		Map<String,Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return response;
	}

}
