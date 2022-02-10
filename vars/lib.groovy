def SimpleHelloFromLib () {
    script {
        bat "echo Hallo from lib! Just for testing."
    }
}


def HalloFromLib (name) {
    script {
        bat "echo Hallo from lib, ${name}!"
    }
}