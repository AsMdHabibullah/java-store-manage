package giantdev.microstore.repository;

import giantdev.microstore.models.Store;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StoreRepo extends JpaRepository<Store, Integer> {

}