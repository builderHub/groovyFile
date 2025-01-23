pipelineJob("PIPELINEJOB_01") {
  description("testing seed")
	
  definition {
    cps {
  
    script (
    """
	pipeline{
    //global Level
    agent any
    
    
    //global
    stages{
        stage("Stage 01"){
            //stage level
            steps{
                sh '''
                    ps -ef
                    uname -a
                    '''
            }
        }
        
        stage("Stage 02"){
            //stage level
            steps{
                sh 'echo "hello world"'
            }
        }
    }
    post{
        always{
            echo "This is post always"
        }
        failure {
            echo "This is from failure block"
        }
    }
    
} 

"""
) 

  }
}
}
