package com.controlclientes.demo.repositorio;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.controlclientes.demo.entidades.Empleado;

public interface EmpleadoRepository extends PagingAndSortingRepository<Empleado, Long>{
    
}
