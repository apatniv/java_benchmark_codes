package com.vicky;

import org.openjdk.jmh.annotations.*;

import java.util.List;
import java.util.PriorityQueue;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@State(Scope.Thread)
public class PriorityQueueBenchmark {

    @Param(value = {"50", "500", "5000"})
    int N;
    private List<Integer> bestCase;
    private List<Integer> worstCase;
    private List<Integer> randomCase;

    @Setup
    public void setUp() {
        bestCase = IntStream.range(1, N + 1)
                .boxed()
                .collect(Collectors.toList());

        worstCase = IntStream.iterate(N, size -> size - 1)
                .limit(N)
                .boxed()
                .collect(Collectors.toList());

        randomCase = new Random().ints(N).boxed().collect(Collectors.toList());

    }

    @Benchmark
    @BenchmarkMode({Mode.Throughput, Mode.AverageTime})
    @OutputTimeUnit(TimeUnit.MICROSECONDS)
    public PriorityQueue<Integer> worstCaseViaConstructor() {
        return new PriorityQueue<Integer>(worstCase);
    }


    @Benchmark
    @BenchmarkMode({Mode.Throughput, Mode.AverageTime})
    @OutputTimeUnit(TimeUnit.MICROSECONDS)
    public PriorityQueue<Integer> worstCaseViaAddAll() {
        var queue = new PriorityQueue<Integer>();
        queue.addAll(worstCase);
        return queue;
    }


    @Benchmark
    @BenchmarkMode({Mode.Throughput, Mode.AverageTime})
    @OutputTimeUnit(TimeUnit.MICROSECONDS)
    public PriorityQueue<Integer> bestCaseViaConstructor() {
        return new PriorityQueue<Integer>(bestCase);
    }


    @Benchmark
    @BenchmarkMode({Mode.Throughput, Mode.AverageTime})
    @OutputTimeUnit(TimeUnit.MICROSECONDS)
    public PriorityQueue<Integer> bestCaseViaAddAll() {
        var queue = new PriorityQueue<Integer>();
        queue.addAll(bestCase);
        return queue;
    }


    @Benchmark
    @BenchmarkMode({Mode.Throughput, Mode.AverageTime})
    @OutputTimeUnit(TimeUnit.MICROSECONDS)
    public PriorityQueue<Integer> randomCaseViaConstructor() {
        return new PriorityQueue<Integer>(randomCase);
    }


    @Benchmark
    @BenchmarkMode({Mode.Throughput, Mode.AverageTime})
    @OutputTimeUnit(TimeUnit.MICROSECONDS)
    public PriorityQueue<Integer> randomCaseViaAddAll() {
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
        queue.addAll(randomCase);
        return queue;
    }
}

