package com.formation.dao;

import java.util.ArrayList;

import com.formation.entities.Activite;

public interface IActiviteDao {

	ArrayList<Activite> listeActivite();

	ArrayList<Activite> listeActiviteReserve();

}