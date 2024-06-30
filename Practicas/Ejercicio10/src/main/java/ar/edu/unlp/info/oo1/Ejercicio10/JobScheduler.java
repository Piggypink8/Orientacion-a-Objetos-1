package ar.edu.unlp.info.oo1.Ejercicio10;

import java.util.ArrayList;
import java.util.List;

public class JobScheduler {
    protected List<JobDescription> jobs;
    protected Strategy strategy;

    public JobScheduler (Strategy strategy) {
        this.jobs = new ArrayList<>();
        this.strategy = strategy;
    }
    public JobScheduler () {
        this.jobs = new ArrayList<>();
        this.strategy = new FIFO();
    }

    public void schedule(JobDescription job) {
        this.jobs.add(job);
    }

    public void unschedule(JobDescription job) {
        if (job != null) {
            this.jobs.remove(job);
        }
    }

    public Strategy getStrategy() {
        return this.strategy; 
    }

    public List<JobDescription> getJobs(){
        return jobs;
    }

    public void setStrategy(Strategy aStrategy) {
        this.strategy = aStrategy;
    }

    public JobDescription next() {
        JobDescription nextJob = this.strategy.next(this.jobs); // Según la estrategia que esté, aplico su metodo correspondiente
        this.unschedule(nextJob);
        return nextJob;
    }

}
