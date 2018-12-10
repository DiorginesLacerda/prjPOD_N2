package br.edu.qi.planetoffice.service;



public interface IService <T>{

	public Iterable<T>getAll();
	public void save(T t);
	
}
