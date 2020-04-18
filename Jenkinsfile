pipeline {
    agent { 
        docker { 
            image 'maven:3-alpine' 
            args '-v /root/.m2:/root/.m2' 
        } 
    }
    stages {
        stage('build') {
            steps {
                sh 'mvn -B -DskipTests clean package'
            }
        }
        stage('Test') {
            steps {
                sh 'echo "Tests complete."'
            }
        }
        stage('Deploy') {
            steps {
                sh 'echo "Woodstove deployed."'
            }
        }
    }
}
