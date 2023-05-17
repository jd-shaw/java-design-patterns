package com.shaw.abstractfactory.commons;

import com.shaw.abstractfactory.service.AirVehicleFactory;
import com.shaw.abstractfactory.service.LandVehicleFactory;
import com.shaw.abstractfactory.service.SeaVehicleFactory;

/**
 * @author shaw
 * @date 2023/5/17
 */
public class Country {

    private AirVehicleFactory airVehicleFactory;
    private LandVehicleFactory landVehicleFactory;
    private SeaVehicleFactory seaVehicleFactory;

    public AirVehicleFactory getAirVehicleFactory() {
        return airVehicleFactory;
    }

    public void setAirVehicleFactory(AirVehicleFactory airVehicleFactory) {
        this.airVehicleFactory = airVehicleFactory;
    }

    public LandVehicleFactory getLandVehicleFactory() {
        return landVehicleFactory;
    }

    public void setLandVehicleFactory(LandVehicleFactory landVehicleFactory) {
        this.landVehicleFactory = landVehicleFactory;
    }

    public SeaVehicleFactory getSeaVehicleFactory() {
        return seaVehicleFactory;
    }

    public void setSeaVehicleFactory(SeaVehicleFactory seaVehicleFactory) {
        this.seaVehicleFactory = seaVehicleFactory;
    }

}
