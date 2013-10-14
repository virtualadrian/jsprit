/*******************************************************************************
 * Copyright (C) 2013  Stefan Schroeder
 * 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either 
 * version 3.0 of the License, or (at your option) any later version.
 * 
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public 
 * License along with this library.  If not, see <http://www.gnu.org/licenses/>.
 ******************************************************************************/
package algorithms;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import algorithms.acceptors.AcceptNewRemoveWorstTest;
import algorithms.selectors.SelectBestTest;
import algorithms.selectors.SelectRandomlyTest;



@RunWith(Suite.class)
@Suite.SuiteClasses({
	CalcVehicleTypeDependentServiceInsertionTest.class,
//  FindCheaperVehicleTest.class,
	GendreauPostOptTest.class,
	TestAlgorithmReader.class,
//	TestAux.class,
	TestCalculatesServiceInsertion.class,
	TestCalculatesServiceInsertionOnRouteLevel.class,
	TestSchrimpf.class,
	
    TestJobDistanceAvgCosts.class,
    TestTourStateUpdaterWithService.class,
    
	SelectBestTest.class,
    SelectRandomlyTest.class,
    AcceptNewRemoveWorstTest.class,
//    TestUpdateTourStatesForwardInTime.class
   
})
public class AlgorithmsSuite {}
