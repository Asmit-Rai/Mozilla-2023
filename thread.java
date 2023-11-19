public class thread {
    import java.util.LinkedList;
import java.util.Queue;

class Process {
    String name;
    int arrivalTime;
    int burstTime;

    public Process(String name, int arrivalTime, int burstTime) {
        this.name = name;
        this.arrivalTime = arrivalTime;
        this.burstTime = burstTime;
    }
}

public class FCFS {
    public static void main(String[] args) {
        Queue<Process> processes = new LinkedList<>();
        processes.add(new Process("P1", 0, 24));
        processes.add(new Process("P2", 1, 3));
        processes.add(new Process("P3", 2, 3));
        processes.add(new Process("P4", 3, 1));
        fcfsScheduling(processes);
    }
    public static void fcfsScheduling(Queue<Process> processes) {
        int currentTime = 0;
        while (!processes.isEmpty()) {
            Process currentProcess = processes.poll();
            int waitingTime = currentTime - currentProcess.arrivalTime;
            currentTime += currentProcess.burstTime;
            int turnaroundTime = currentTime - currentProcess.arrivalTime;
            System.out.println("Process " + currentProcess.name + ":");
            System.out.println("Arrival Time: " + currentProcess.arrivalTime);
            System.out.println("Burst Time: " + currentProcess.burstTime);
            System.out.println("Waiting Time: " + waitingTime);
            System.out.println("Turnaround Time: " + turnaroundTime);
            System.out.println();
        }
    }
}

    
}
