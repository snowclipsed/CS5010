	# Mid Semester Project

By Hardik Bishnoi

### What have I made?

For my mid-semester project, I designed and developed a satellite tracker using a combination of ARCGIS and JavaFX. This innovative application allows users to track the movement of various satellites in real-time, providing valuable information about their orbits and positions. 

### What does it do? (Functionality)

The [NORAD](https://en.wikipedia.org/wiki/Satellite_Catalog_Number) catalogue of satellite objects is a comprehensive list of man-made objects orbiting the Earth. 

The main focus of the project is to help any amateur astronomer (the planned audience) and stargazer to track any sky objects that are catalogued by NORAD. The current prototype achieves this partly by implementing a basic satellite tracker which displays the live location of a satellite on the map of the Earth from a small list. It also can successfully call the relative position of a satellite with respect to the observer from the N2YO API, but that implementation is for the future.

This is achieved by allowing two APIs to communicate. We use [N2YO](https://www.n2yo.com/api/)'s API to get the current location in latitude and longitude of the satellite every 10 seconds, and then use [ARCGIS's API](https://developers.arcgis.com/java/) to transform it into x,y coordinates with relation to a map on a JavaFX window. The viewer can also utilize a drop down button to switch satellites, as well as a side slider to zoom in and out into the map. 

### Future Plans

Here's a list of features I would want to include into this project:

- Add more satellites.
- Predict the future path (called ground track) of the satellite using Two-Line Element Sets and SGP4 algorithms. 
  - See: https://www.gano.name/shawn/JSatTrak/
  - https://github.com/anoved/Ground-Track-Generator
- Take location input/fetch current device location.
- Fetch pass information for a user/location for a specific satellite for x number of days.
- Day/Night Counter on satellite (if it is in the day as in invisible to the eye).
- Current Satellite luminosity magnitude.
- Improve security so user does not have to interact with the code to enter their API keys.
- Improve UI elements (contrast against map).
- Add an easter egg.

Here is a Gantt Chart of the same. (Note, this shows progress **AFTER** the mid semester project because I removed the tasks to the complete bin in notion hence it stopped displaying them. I can create a notion link to share the previous tasks if needed. Regardless, it has elements which are complete (nearly) but are not in the mid-semester version since I have not written JUnit tests for them.)

![image-20231101004413659](C:\Users\harry\AppData\Roaming\Typora\typora-user-images\image-20231101004413659.png)

# Final Notes on API Usage

The N2YO API used is not paid, but has usage restrictions.

https://www.n2yo.com/login/register/ Register here. 

Follow instructions here : https://www.n2yo.com/api/

The ARCGIS API is not paid. 

https://developers.arcgis.com/java/get-started/

Follow these instructions.

When you have your API keys ready, go the the Constants class after unzipping the file and put your API keys there.



![Star Wars Hyperspace Explained—Lucasfilm's Lightspeed Spaceflight](https://i.kinja-img.com/image/upload/c_fill,h_675,pg_1,q_80,w_1200/c8dce355ec2381d3f447cd4e978a08d5.png)

May the force be with you, and happy Hallowe'en!