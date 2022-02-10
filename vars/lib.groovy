def SimpleHelloFromLib() {
    echo "1. Hallo from lib! Just for testing."
    script {
        bat "2. echo Hallo from lib! Just for testing."
    }
}

def HalloFromLib(name) {
    echo "1. Hallo from lib, ${name}!"
    script {
        bat "2. echo Hallo from lib, ${name}!"
    }
}

def call(String name = 'human') {
  echo "Hello, ${name}."
}