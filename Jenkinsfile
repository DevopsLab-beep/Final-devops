pipeline {
    agent any
    
    stages {
        stage('Checkout') {
            steps {
                echo 'Checking out the source code...'
                git url: 'https://github.com/DevopsLab-beep/Final-devops.git', branch: 'main'
            }
        }
        stage('Build') {
            steps {
                echo 'Building the project...'
                // Add build steps here
            }
        }
        stage('Test') {
            steps {
                echo 'Running tests...'
                // Add test steps here
            }
        }
    }
    
    post {
        success {
            echo 'Pipeline completed successfully!'
        }
        failure {
            echo 'Pipeline failed. Please check the logs for details.'
        }
    }
}
