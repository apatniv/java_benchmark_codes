# priority-map-benchmark
Sample Benchmarking used for the blog post

[Corressponding blog post](https://www.vivekakupatni.com/java-priority-queue/)



## Benchmark Results 

> On my mac laptop using jdk 11



```bash
Benchmark                                         (N)   Mode  Cnt    Score    Error   Units                                                                                                    
PriorityQueueBenchmark.bestCaseViaAddAll           50  thrpt   25    2.761 ±  0.016  ops/us                                                                                                    
PriorityQueueBenchmark.bestCaseViaAddAll          500  thrpt   25    0.277 ±  0.004  ops/us                                                                                                    
PriorityQueueBenchmark.bestCaseViaAddAll         5000  thrpt   25    0.023 ±  0.003  ops/us
PriorityQueueBenchmark.bestCaseViaConstructor      50  thrpt   25    5.150 ±  0.608  ops/us                                                                                                    
PriorityQueueBenchmark.bestCaseViaConstructor     500  thrpt   25    0.683 ±  0.001  ops/us                                                                                                    
PriorityQueueBenchmark.bestCaseViaConstructor    5000  thrpt   25    0.069 ±  0.001  ops/us                                                                                                    
PriorityQueueBenchmark.randomCaseViaAddAll         50  thrpt   25    1.373 ±  0.289  ops/us                                                                                                    
PriorityQueueBenchmark.randomCaseViaAddAll        500  thrpt   25    0.129 ±  0.004  ops/us                                                                                                    
PriorityQueueBenchmark.randomCaseViaAddAll       5000  thrpt   25    0.009 ±  0.001  ops/us                                                                                                    
PriorityQueueBenchmark.randomCaseViaConstructor    50  thrpt   25    2.945 ±  0.209  ops/us                                                                                                    
PriorityQueueBenchmark.randomCaseViaConstructor   500  thrpt   25    0.331 ±  0.020  ops/us                                                                                                    
PriorityQueueBenchmark.randomCaseViaConstructor  5000  thrpt   25    0.016 ±  0.001  ops/us                                                                                                    
PriorityQueueBenchmark.worstCaseViaAddAll          50  thrpt   25    0.856 ±  0.085  ops/us                                                                                                    
PriorityQueueBenchmark.worstCaseViaAddAll         500  thrpt   25    0.066 ±  0.003  ops/us                                                                                                    
PriorityQueueBenchmark.worstCaseViaAddAll        5000  thrpt   25    0.005 ±  0.001  ops/us                                                                                                    
PriorityQueueBenchmark.worstCaseViaConstructor     50  thrpt   25    3.163 ±  0.031  ops/us                                                                                                    
PriorityQueueBenchmark.worstCaseViaConstructor    500  thrpt   25    0.328 ±  0.002  ops/us                                                                                                    
PriorityQueueBenchmark.worstCaseViaConstructor   5000  thrpt   25    0.031 ±  0.001  ops/us


PriorityQueueBenchmark.bestCaseViaAddAll           50   avgt   25    0.362 ±  0.001   us/op                                                                                                    
PriorityQueueBenchmark.bestCaseViaAddAll          500   avgt   25    3.801 ±  0.260   us/op                                                                                                    
PriorityQueueBenchmark.bestCaseViaAddAll         5000   avgt   25   55.818 ±  2.087   us/op                                                                                                    

PriorityQueueBenchmark.bestCaseViaConstructor      50   avgt   25    0.167 ±  0.001   us/op                                                                                                    
PriorityQueueBenchmark.bestCaseViaConstructor     500   avgt   25    1.455 ±  0.004   us/op                                                                                                    
PriorityQueueBenchmark.bestCaseViaConstructor    5000   avgt   25   14.435 ±  0.021   us/op                                                                                                    

PriorityQueueBenchmark.randomCaseViaAddAll         50   avgt   25    0.587 ±  0.005   us/op                                                                                                    
PriorityQueueBenchmark.randomCaseViaAddAll        500   avgt   25    7.582 ±  0.267   us/op                                                                                                    
PriorityQueueBenchmark.randomCaseViaAddAll       5000   avgt   25  119.197 ±  7.268   us/op                                                                                                    
PriorityQueueBenchmark.randomCaseViaConstructor    50   avgt   25    0.331 ±  0.005   us/op                                                                                                      
PriorityQueueBenchmark.randomCaseViaConstructor   500   avgt   25    2.885 ±  0.069   us/op                                                                                                       
PriorityQueueBenchmark.randomCaseViaConstructor  5000   avgt   25   63.401 ±  0.462   us/op                                                                                                                 
PriorityQueueBenchmark.worstCaseViaAddAll          50   avgt   25    0.962 ±  0.036   us/op                                                                                                                 
PriorityQueueBenchmark.worstCaseViaAddAll         500   avgt   25   16.349 ±  1.934   us/op                                                                                                                 
PriorityQueueBenchmark.worstCaseViaAddAll        5000   avgt   25  221.430 ± 24.875   us/op                                                                                                                 
PriorityQueueBenchmark.worstCaseViaConstructor     50   avgt   25    0.319 ±  0.006   us/op                                                                                                                 
PriorityQueueBenchmark.worstCaseViaConstructor    500   avgt   25    3.139 ±  0.020   us/op                                                                                                                      
PriorityQueueBenchmark.worstCaseViaConstructor   5000   avgt   25   32.609 ±  0.050   us/op  

```
