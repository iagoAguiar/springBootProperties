package com.boaglio.casadocodigo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import com.boaglio.casadocodigo.dominio.Propriedade;

public interface PropriedadeRepository extends PagingAndSortingRepository <Propriedade, String> {
	
	@Query("Select c from Propriedade c where c.nome like %:filtro% order by categoria, nome")
	public List<Propriedade>findbyFiltro(@Param("filtro") String filtro);
}
