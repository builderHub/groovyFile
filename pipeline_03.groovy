pipelineJob("PIPELINEJOB_03") {
  description("testing seed")
	
  definition {
    cps {
  
    script (
    """

pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                sh 'make build'
            }
        }
        stage('Test') {
            steps {
                sh 'make test'
            }
        }
    }
}
"""
)
}
}
}
