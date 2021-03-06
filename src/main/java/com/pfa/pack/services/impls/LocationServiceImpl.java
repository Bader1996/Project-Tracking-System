package com.pfa.pack.services.impls;

import java.util.Collections;
import java.util.NoSuchElementException;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pfa.pack.models.collectionwrappers.LocationsCollection;
import com.pfa.pack.models.entities.Location;
import com.pfa.pack.repositories.LocationRepository;
import com.pfa.pack.services.LocationService;

@Service
@Transactional
public class LocationServiceImpl implements LocationService {
	
	private final LocationRepository rep;
	private static final Logger logger = LoggerFactory.getLogger(LocationServiceImpl.class);
	
	static {
		logger.info("************ entering " + LocationServiceImpl.class.getName() + " ************");
	}
	
	@Autowired
	public LocationServiceImpl(final LocationRepository rep) {
		this.rep = rep;
	}
	
	@Override
	public LocationsCollection findAll() {
		return new LocationsCollection(Collections.unmodifiableList(this.rep.findAll()));
	}
	
	@Override
	public Location findById(final Integer locationId) {
		return this.rep.findById(locationId).orElseThrow(() -> new NoSuchElementException("\\n------------ NO ELEMENT FOUND !!!!! ------------\\n"));
	}
	
	@Override
	public Location save(final Location location) {
		return this.rep.save(location);
	}
	
	@Override
	public Location update(final Location location) {
		return this.rep.save(location);
	}
	
	@Override
	public void delete(final Integer locationId) {
		this.rep.delete(this.findById(locationId));
	}
	
	
	
}










