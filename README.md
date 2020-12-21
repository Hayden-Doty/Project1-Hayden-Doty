# Project1-Hayden-Doty

## Running The Program
To run the program from command line, download the files, go to the directory, then run the following commands
> javac Driver.java<br>
> java Driver
## Classes

### Driver
*Driver Class, prewritten by Mohammad Mukhtaruzzaman. Contains main method*

### HammingDist

#### Class Variables
- **allStations**: private ArrayList<String>, stores all STIDs from Mesonet.txt
- **nrmn**: private String, is "NRMN"
- **s1**: private String, value of the first inputted String
- **s2**: private String, value of the second inputted String
  
#### Methods

##### HammingDist(String s1, String s2)
*Constructor Method*
###### Inputs
- **s1**: first string that will be used
- **s2**: second string that will be used
###### Possible Errors
Throws IOException due to FileInputStream and Scanner
###### Functionality
This method is a constructor and it also takes in the Mesonet.txt file using FileInputStream  
As it takes in the STIDs from Mesonet.txt, it adds them to the **allStations** ArrayList
  
##### hamm(String first, String second)
###### Inputs
- **first**: first string to be used when calculating Hamming Distance
- **second**: second string to be used for Hamming Distance calculation
###### Output
- **counter**: value of Hamming Distance
###### Possible Errors
May throw error if given a string of incorrect size
###### Functionality
This method finds the Hamming Distance between two strings and returns the value

##### toString(String s1, String s2)
###### Inputs
- **s1**: Same string as listed in the constructor
- **s2**: Same string as listed  in the constructor
###### Output
- **msg**: a string that indicates all functionality of this class
> Example:
>
> The Hamming distance between Norman and NEWK is 3; between Norman and WEBR is 4. <br>
> For NEWK: Number of stations with Hamming Distance 3 : 20. <br>
> For WEBR: Number of stations with Hamming Distance 4: 90.
###### Functionality
This method runs the string from the constructor through the hamm method, stores how many stations are the same Hamming Distance from each selected station as it is fron NRMN, and prints this data.

### DateTimeOne
#### Methods

##### dateTimeNow()
*Prewritten by Mohammad Mukhtaruzzaman*
###### Functionality
This Method prints the current Date/Time 
> Date/Time pattern:
>
> MM/dd/yyyy hh:mm AM/PM

##### getValueOfSecond()
###### Output
- **second**: integer representation of the seconds value for the current Date/Time
###### Functionality
This Method returns the seconds value for the current Date/Time

##### sleepForThreeSec()
###### Functionality
This Method sleeps the program for 3 seconds
