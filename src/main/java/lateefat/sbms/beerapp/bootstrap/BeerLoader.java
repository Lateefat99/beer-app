package lateefat.sbms.beerapp.bootstrap;

import lateefat.sbms.beerapp.domain.Beer;
import lateefat.sbms.beerapp.repositories.BeerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class BeerLoader implements CommandLineRunner {
    private final BeerRepository beerRepository;

    public BeerLoader(BeerRepository beerRepository) {
        this.beerRepository = beerRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        loadBeerObject();
    }

    private void loadBeerObject() {
        if (beerRepository.count() == 0){
            beerRepository.save(Beer.builder()
                    .beerName("Mongo DB")
                    .beerStyle("IPA")
                    .quantityToBrew(300)
                    .minOnHand(20)
                    .upc(3370100000001L)
                    .price(new BigDecimal("12.95"))
                    .build());

            beerRepository.save(Beer.builder()
                    .beerName("Unit Test")
                    .beerStyle("ALE")
                    .quantityToBrew(300)
                    .minOnHand(20)
                    .upc(3370100000002L)
                    .price(new BigDecimal("14.95"))
                    .build());

            System.out.println("Loaded Beers " + beerRepository.count());
        }
    }

}
