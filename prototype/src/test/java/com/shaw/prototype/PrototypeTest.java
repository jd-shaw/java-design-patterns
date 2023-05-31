package com.shaw.prototype;

import com.shaw.prototype.bean.CNBoatSeaVehicle;
import com.shaw.prototype.bean.CNFightAirVehicle;
import com.shaw.prototype.bean.CNTruckLandVehicle;
import com.shaw.prototype.bean.USBoatSeaVehicle;
import com.shaw.prototype.bean.USFightAirVehicle;
import com.shaw.prototype.bean.USTruckLandVehicle;
import com.shaw.prototype.service.impl.MachineFactoryImpl;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

/**
 * @author xjd
 * @date 2023/5/24
 */
@Slf4j
public class PrototypeTest {

    @Test
    public void test() {
        MachineFactoryImpl cnMachineFactory = new MachineFactoryImpl(
                new CNFightAirVehicle("protect"),
                new CNTruckLandVehicle("carry"),
                new CNBoatSeaVehicle("fishing")
        );
        log.info(cnMachineFactory.createAirVehicle().toString());
        log.info(cnMachineFactory.createLandVehicle().toString());
        log.info(cnMachineFactory.createSeaVehicle().toString());

        MachineFactoryImpl usMachineFactory = new MachineFactoryImpl(
                new USFightAirVehicle("fight"),
                new USTruckLandVehicle("transport oil"),
                new USBoatSeaVehicle("fishing oil")
        );
        log.info(usMachineFactory.createAirVehicle().toString());
        log.info(usMachineFactory.createLandVehicle().toString());
        log.info(usMachineFactory.createSeaVehicle().toString());
    }

}
