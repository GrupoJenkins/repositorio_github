pipeline {
    agent any
    parameters {
        string(name: 'Greeting', defaultValue: 'Hello', description: 'How should I greet the world?')
    }
    options {
    skipDefaultCheckout(true)
    }
    stages {
        stage('Build') {
            steps {
                echo "${params.Greeting} World!"
                echo "${params.Greeting} Mundo mundial!"
                
            }
        }
    }
}
