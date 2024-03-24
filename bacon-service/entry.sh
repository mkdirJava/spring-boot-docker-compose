    #!/bin/bash
    gradle -t classes &
    gradle runInDockerCompose -Pport="$DEBUG_PORT"