package com.shaw.abstractfactory;

import com.shaw.abstractfactory.commons.Country;
import com.shaw.abstractfactory.commons.FactoryMaker;
import com.shaw.abstractfactory.service.MachineFactory;
import org.junit.jupiter.api.Test;

/**
 * @author shaw
 * @date 2023/5/17
 */
public class MachineFactoryTest {

    private final Country country = new Country();

    public Country getCountry() {
        return country;
    }

    @Test
    public void test() {
        create(FactoryMaker.CountryType.CN);
        System.out.println(getCountry().getAirVehicleFactory().getDescription());
        System.out.println(getCountry().getLandVehicleFactory().getDescription());
        System.out.println(getCountry().getSeaVehicleFactory().getDescription());

        create(FactoryMaker.CountryType.US);
        System.out.println(getCountry().getAirVehicleFactory().getDescription());
        System.out.println(getCountry().getLandVehicleFactory().getDescription());
        System.out.println(getCountry().getSeaVehicleFactory().getDescription());

    }

    public void create(final FactoryMaker.CountryType type) {
        final MachineFactory machineFactory = FactoryMaker.makeFactory(type);
        country.setLandVehicleFactory(machineFactory.createLandVehicle());
        country.setAirVehicleFactory(machineFactory.createAirVehicle());
        country.setSeaVehicleFactory(machineFactory.createSeaVehicle());
    }
}
