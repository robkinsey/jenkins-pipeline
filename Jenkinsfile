pipeline {
    agent { 
        docker { 
            image 'maven:3-alpine' 
        } 
    }
    options {
        skipStagesAfterUnstable()
    }
    stages {
        stage('build') {
            steps {
                sh 'mvn -B -DskipTests clean package'
            }
        }
        stage('Test') {
            steps {
                sh 'mvn test'
            }
            post {
                always {
                    junit 'target/surefire-reports/*.xml'
                }
            }
        }
        stage('Deploy') {
            steps {
                sh './scripts/deliver.sh'
            }
        }
    }
}
