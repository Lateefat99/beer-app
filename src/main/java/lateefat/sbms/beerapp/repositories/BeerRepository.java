package lateefat.sbms.beerapp.repositories;

import lateefat.sbms.beerapp.domain.Beer;

import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.UUID;

public interface BeerRepository extends PagingAndSortingRepository<Beer, UUID> {

}
