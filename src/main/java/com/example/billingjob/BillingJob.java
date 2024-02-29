package com.example.billingjob;

//This class is not used in the project, but it is a good example of how to create a job without using annotations

//@RequiredArgsConstructor
public class BillingJob //implements Job
{

    //private final JobRepository jobRepository;

//    @Override
//    public String getName() {
//        return "BillingJob";
//    }
//
//    @Override
//    public void execute(JobExecution execution) {
//        //failedPathExample(execution);
//
//        // Example of a successful path
//        JobParameters jobParameters = execution.getJobParameters();
//        String inputFile = jobParameters.getString("input.file");
//        System.out.println("processing billing information from file " + inputFile);
//        execution.setStatus(BatchStatus.COMPLETED);
//        execution.setExitStatus(ExitStatus.COMPLETED);
//        this.jobRepository.update(execution);
//    }
//
//    private void failedPathExample(JobExecution execution) {
//        try {
//            throw new Exception("Unable to process billing information");
//        } catch (Exception exception) {
//            execution.addFailureException(exception);
//            execution.setStatus(BatchStatus.COMPLETED);
//            execution.setExitStatus(ExitStatus.FAILED.addExitDescription(exception.getMessage()));
//        } finally {
//            this.jobRepository.update(execution);
//        }
//    }
}
