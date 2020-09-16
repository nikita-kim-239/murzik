/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.space.repository;


import com.space.model.Ship;
import org.springframework.data.jpa.repository.*;
/**
 *
 * @author Никита
 */
public interface ShipRepository extends JpaRepository <Ship,Long>,JpaSpecificationExecutor <Ship>{
    
}
