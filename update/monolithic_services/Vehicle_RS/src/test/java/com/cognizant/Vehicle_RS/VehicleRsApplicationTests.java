////package com.cognizant.Vehicle_RS;
////
////import org.junit.Test;
////import org.junit.runner.RunWith;
////import org.springframework.boot.test.context.SpringBootTest;
////import org.springframework.test.context.junit4.SpringRunner;
////
////@RunWith(SpringRunner.class)
////@SpringBootTest
////public class VehicleRsApplicationTests {
////
////	@Test
////	public void contextLoads() {
////	}
////
////}
//
//
//
//
////
////package com.cognizant.Vehicle_RS;
////
////import static org.junit.Assert.assertEquals;
////
////import java.util.Date;
////import java.util.List;
////import java.util.Optional;
//
//import java.util.List;
//
//import org.junit.FixMethodOrder;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import com.cognizant.Vehicle_RS.model.Booking;
//import com.cognizant.Vehicle_RS.model.User;
//import com.cognizant.Vehicle_RS.model.Vehicle;
//import com.cognizant.Vehicle_RS.repository.BookingRepository;
//import com.cognizant.Vehicle_RS.repository.UserRepository;
//import com.cognizant.Vehicle_RS.repository.VehicleRepository;
//import com.cognizant.Vehicle_RS.service.AppUserDetailsService;
//import com.cognizant.Vehicle_RS.service.BookingService;
//import com.cognizant.Vehicle_RS.service.VehicleService;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest
//@FixMethodOrder
//public class VehicleRsApplicationTests {
//
//                @Autowired
//                private VehicleService vehicleService;
//
//                @Autowired
//                private BookingService bookingService;
//
//                @Autowired
//                private AppUserDetailsService appUserDetailsService;
//
//                @Autowired
//                private VehicleRepository vehicleRepository;
//
//                @Autowired
//                private BookingRepository bookingRepository;
//                @Autowired
//                private UserRepository userRepository;
//
//                @Test
//                public void addVehicleTest() {
//
//                                Vehicle vehicle = new Vehicle(35, "Merc AMG", "hello", "ASDFGHJK", "2", "petrol", 356, true, "SK",
//                                                                new Date(2019, 02, 02), new Date(2019, 02, 02), new Date(2019, 02, 02), false);
//                                vehicleService.newVehicle(vehicle);
//                                Optional<Vehicle> result = vehicleRepository.findByName("Merc AMG");
//                                assertEquals(result.isPresent(), true);
//
//                }
//
//                @Test
//                public void getAllVehicleTest() {
//                                List<Vehicle> vehicle = vehicleService.getAllVehicle();
//                                assertEquals(vehicle.isEmpty(), false);
//                }
//
//                @Test
//                public void aamodifyVehicleTest() {
//                                Optional<Vehicle> result = vehicleRepository.findByName("Merc AMG");
//                                Vehicle vehicle = result.get();
//                                vehicle.setStatus(true);
//                                vehicle.setImage("Bye");
//                                vehicle.setActive(false);
//                                vehicleService.modifyVehicle(vehicle);
//                                Optional<Vehicle> res2 = vehicleRepository.findById(vehicle.getId());
//                                Vehicle vehicle2 = res2.get();
//                                assertEquals(vehicle2.getImage(), "Bye");
//                                assertEquals(vehicle2.isStatus(), true);
//                                assertEquals(vehicle2.isActive(), false);
//                                assertEquals(vehicle2.getBranch(), "SK");
//                                vehicleService.deleteVehicle(vehicle2.getId());
//                                Optional<Vehicle> res3 = vehicleRepository.findById(vehicle.getId());
//
//                                assertEquals(res3.isPresent(), false);
//
//                }
//
//                @Test
//                public void addNewBookingTest() {
//
//                                Booking booking = new Booking(new Date(2019, 02, 02), new Date(2019, 02, 12));
//                                bookingService.addVehicleToBooking("skk", 3, booking);
//                                User user = userRepository.findByUsername("skk");
//                                Booking booking1 = user.getBooking();
//                                Optional<Booking> result = bookingRepository.findById(booking1.getId());
//                                assertEquals(result.isPresent(), true);
//
//                }
//
//                @Test
//                public void cancelBookingTest() {
//                                User user = userRepository.findByUsername("skk");
//                                Booking booking1 = user.getBooking();
//                                bookingService.CancelBooking("skk", 3);
//                                Optional<Booking> result2 = bookingRepository.findById(booking1.getId());
//                                assertEquals(result2.isPresent(), false);
//
//                }
//
//}
//
//
//
////////////////////////////// Vehicle.java
//
//
//       public Vehicle(int id, String name, String image, String vehicle_no, String seater, String type, double price,
//                     boolean active, String branch, Date insurance_exp_date, Date last_service_date, Date service_due_date,
//                     boolean status) {
//              super();
//              this.id = id;
//              this.name = name;
//              this.image = image;
//              this.vehicle_no = vehicle_no;
//              this.seater = seater;
//              this.type = type;
//              this.price = price;
//              this.active = active;
//              this.branch = branch;
//              this.insurance_exp_date = insurance_exp_date;
//              this.last_service_date = last_service_date;
//              this.service_due_date = service_due_date;
//              this.status = status;
//       }
//
/////////////////////////////  Booking.java
//
//       public Booking( Date bookingStart, Date bookingEnd) {
//              this.bookingStart = bookingStart;
//              this.bookingEnd = bookingEnd;
//       }
//
