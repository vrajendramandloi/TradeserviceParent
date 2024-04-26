package com.util.uni.productsService.repository;

import com.util.uni.productsService.model.Products;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;
import java.util.List;

public interface  ProductsRepository extends CrudRepository<Products, Long> {
    /*@Modifying(clearAutomatically = true)
    @Query("update Products feedEntry set feedEntry.read =:isRead where feedEntry.id =:entryId")
    void markEntryAsRead(@Param("entryId") Long rssFeedEntryId, @Param("isRead") boolean isRead);*/
}
