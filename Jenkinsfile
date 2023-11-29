pipeline {
    agent {
		label 'master'
	}
    stages {
        stage('build') {
            steps {
				sh '~/apache-maven-3.6.3/bin/mvn clean package'
            }
        }
		stage('deploy') {
			steps {
				dir('target') {
					sh 'JENKINS_NODE_COOKIE=dontKillMe nohup ~/Library/Java/JavaVirtualMachines/corretto-1.8.0_392/Contents/Home/bin/java -jar JenkinsDemo-1.0-SNAPSHOT.jar > output.log 2>&1 &'
				}
			}
		}
    }
    post {
        always {
            echo 'This will always run'
        }
        success {
            echo 'This will run only if successful'
        }
        failure {
            echo 'This will run only if failed'
        }
        unstable {
            echo 'This will run only if the run was marked as unstable'
        }
        changed {
            echo 'This will run only if the state of the Pipeline has changed'
            echo 'For example, if the Pipeline was previously failing but is now successful'
        }
    }
}
