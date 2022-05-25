package lateefat.sbms.beerapp.web.mappers;

import lateefat.sbms.beerapp.domain.Beer;
import lateefat.sbms.beerapp.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface BeerMapper {
    BeerDto beerToBeerDto(Beer beer);
    Beer beerDtoToBeer(BeerDto beerDto);
}
