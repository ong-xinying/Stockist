package com.sa45team7.stockist.service;

import java.util.ArrayList;

import com.sa45team7.stockist.model.Supplier;

public interface SupplierService {
	
	ArrayList<Supplier> findAllSuppliers();
	
	Supplier findSupplier(Integer supplierId);
	
	Supplier findSupplierByName(String supplierName);
	
	Supplier findSupplierByContactName(String contactName);
	
	Supplier findSupplierByPhoneNumber(String phoneNumber);
	
	Supplier findSupplierByEmail(String email);
	
	Supplier findSupplierByWebSite(String website);
	
	Supplier createSupplier(Supplier supplier);
	
	Supplier updateSupplier(Supplier supplier);

}