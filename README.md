# Algo

<img src="https://user-images.githubusercontent.com/29086284/41807005-c180c8fe-76e5-11e8-8ff8-427db50304e9.png" width="300px"/>


This is lib for sorting, seraching algorithmes with timer to check their performances.Using this lib we can use sorting methods and searching methods in any other programs you creating.

# How to use Algo 

1.Download the Algo from github 

`git clone https://github.com/ShehanPerera/Algo.git`

2.Install the package

`mvn clean install`

3.To run Algo in it self

 go the the target in Algo folder and run the jar.
 
`java -jar algo-1.0-SNAPSHOT.jar `

4.Go to `localhost:9092` for see metrics

5.Use Grafana for visualize metrics as follows 


<b> Metrics of Sorting algorithms </b>
<img src="https://user-images.githubusercontent.com/29086284/42161616-361c63f0-7e19-11e8-8248-b3446d9ee2da.png">


<b> Metrics of Searching algorithms </b>
<img src="https://user-images.githubusercontent.com/29086284/42161704-93f9ffaa-7e19-11e8-92d4-c775c8db7277.png">


<b> Metrics of Data structures algorithms </b>
<img src="https://user-images.githubusercontent.com/29086284/42161734-b0da6452-7e19-11e8-9946-9bbcc35fcb00.png">

6.To ue Algo in other programs

Add algo-1.0-SNAPSHOT.jar to project structure, then Algo can use as follows 

* For Sorting : `import com.github.sorting.*;`
 
* For Searching : `import com.github.serchning.*;`
 
* For Data structure : `import com.github.datastructures.*;`
 
* For Start Metrics server
   
 ```
 import com.github.metrics.MetricsServer;
  ----
  ----
  MetricsServer.getInstance().startReport(); 
  ----
  ----
  ```
 
 
 
 

