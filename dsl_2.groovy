job('example-job-02') {
  triggers {
        cron('H 0 * * *')
    }
  steps {
    shell('echo This is example 2 from SCM')
  }
}
