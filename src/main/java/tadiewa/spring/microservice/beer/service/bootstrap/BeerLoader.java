package tadiewa.spring.microservice.beer.service.bootstrap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import tadiewa.spring.microservice.beer.service.domain.Beer;
import tadiewa.spring.microservice.beer.service.repositories.BeerRepository;


@Component
public class BeerLoader  implements CommandLineRunner {
    @Autowired
    private  final BeerRepository beerRepository;


    public BeerLoader(BeerRepository beerRepository) {
        this.beerRepository = beerRepository;
    }


    @Override
    public void run(String... args) throws Exception {
        loadBeerObjects();
    }

    private void loadBeerObjects(){
    if(beerRepository.count() ==0){

        beerRepository.save(Beer.builder ()
                .beerName("Mango Bobs")
                .beerStyle("IPA")
                .minOnHand(12)
                .quantityToBrew(200)
                .upc(32423426425L)
                .build());


        beerRepository.save(Beer.builder ()
                .beerName("Banana Bobs")
                .beerStyle("jka")
                .minOnHand(12)
                .quantityToBrew(200)
                .upc(32423426445L)
                .build());

    }

    }


}
