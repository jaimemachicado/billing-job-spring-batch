# To execute the code, run the following command in the terminal

* First you need to execute docker and make docker compose up to start the database:

```bash
docker-compose up
```

* Then you need to create the tables for JOB in the database with sql script in sql folder:
  batch-schema-postgresql.sql

* Then you need to create the table in the database with sql script in sql folder:
  batch-create-tables-needed.sql

* First clean and package with maven:

```bash
mvn clean package -Dmaven.test.skip=true
```

Then run the jar file with first csv to billing-2023-01.csv:

```bash
java -jar target/billing-job-0.0.1-SNAPSHOT.jar input.file=input/billing-2023-01.csv output.file=staging/billing-report-2023-01.csv data.year=2023 data.month=1
```

Then run the jar file with second csv to billing-2023-02.csv:

```bash
java -jar target/billing-job-0.0.1-SNAPSHOT.jar input.file=input/billing-2023-02.csv output.file=staging/billing-report-2023-02.csv data.year=2023 data.month=2
```

To run the tests:

```bash
mvn clean test -Dspring.batch.job.enabled=false
```

The property -Dspring.batch.job.enabled=false disables the automatic execution of the job by Spring Boot.
Without this property, the job will be executed twice: a first time at the application's startup, and a
second time during the test. This is obviously not desired when running tests, hence the use of that property.