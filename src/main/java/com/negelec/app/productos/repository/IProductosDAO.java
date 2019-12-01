package com.negelec.app.productos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.negelec.app.productos.entity.Producto;
@Repository
public interface IProductosDAO extends JpaRepository<Producto,Integer>{

}
