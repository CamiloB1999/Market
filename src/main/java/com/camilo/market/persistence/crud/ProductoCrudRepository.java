package com.camilo.market.persistence.crud;


import com.camilo.market.persistence.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import java.util.Optional;


public interface ProductoCrudRepository extends JpaRepository<Producto, Integer> {
    List<Producto> findByIdCategoriaOrderByNombreAsc(int idCategoria);
    Optional<List<Producto>> findByCantidadStockLessThanAndEstado(int cantidadStock, boolean estado);
}
