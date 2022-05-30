package com.ty.hospital.service;

import java.util.List;

import com.ty.hospital.dto.Hospital;

public interface HospitalService
{
	public Hospital saveHospital(Hospital hospital);
	public Hospital getHospitalById(int id);
	public List<Hospital> getAllHospital();
	public Hospital updateHospital(Hospital hospital,int id);
	public boolean delteHospitalById(int id);
}
