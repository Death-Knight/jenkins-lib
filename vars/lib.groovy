def SimpleHelloFromLib () {
    echo "Hallo from lib! Just for testing."
    script {
        bat "echo Hallo from lib! Just for testing."
    }
}

def HalloFromLib (name) {
    echo "Hallo from lib, ${name}!"
    script {
        bat "echo Hallo from lib, ${name}!"
    }
}