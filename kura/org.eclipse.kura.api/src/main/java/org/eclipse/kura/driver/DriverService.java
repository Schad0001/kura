/*******************************************************************************
 * Copyright (c) 2016, 2017 Eurotech and/or its affiliates and others
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Eurotech
 *  Amit Kumar Mondal
 *
 *******************************************************************************/
package org.eclipse.kura.driver;

import java.util.List;

/**
 * The interface DriverService is an utility service API to provide useful
 * methods for drivers
 *
 * @noimplement This interface is not intended to be implemented by clients.
 */
public interface DriverService {

    /**
     * Gets the driver instance by the provided driver PID
     * ({@code kura.service.pid}).
     *
     * @param driverPid
     *            the driver PID to check
     * @return the driver instance
     * @throws NullPointerException
     *             if the provided driver PID is null
     */
    public Driver getDriver(String driverPid);

    /**
     * Gets the driver PID. ({@code kura.service.pid}) by the provided driver
     * instance
     *
     * @param driver
     *            the driver instance to check
     * @return the driver PID
     * @throws NullPointerException
     *             if the provided driver instance is null
     */
    public String getDriverPid(Driver driver);

    /**
     * Returns the list containing all the available driver instances
     *
     * @return the list of drivers available in service registry or empty list
     *         if no drivers are available
     */
    public List<Driver> listDrivers();

}
