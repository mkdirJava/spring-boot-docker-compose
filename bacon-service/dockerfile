FROM gradle:8.6.0-jdk17 as local

WORKDIR /app/code
RUN gradle --no-daemon --warning-mode all 

COPY . /app/code
COPY ./entry.sh /app/entry.sh
RUN chmod 777 /app/entry.sh
RUN chmod 777 /app/code/gradlew
ENTRYPOINT ["bash","/app/entry.sh"]