def SimpleHelloFromLib() {
    echo "1. Hallo from lib! Just for testing."
    script {
        bat "echo 2. Hallo from lib! Just for testing."
    }
    bat "echo 3. Hallo from lib! Just for testing."
}

def HalloFromLib(name) {
    echo "1. Hallo from lib, ${name}!"
    script {
        bat "echo 2. Hallo from lib, ${name}!"
    }
    bat "echo 3. Hallo from lib, ${name}!"
}

def call(String name = 'human') {
  echo "Hello, ${name}."
}