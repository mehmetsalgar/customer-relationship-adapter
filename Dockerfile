FROM alpine:3.17.0@sha256:af06af3514c44a964d3b905b498cf6493db8f1cde7c10e078213a89c87308ba0
COPY output/customer-relationship-adapter-application /opt/docker/customer-relationship-adapter-application
RUN  chmod +x /opt/docker/customer-relationship-adapter-application
CMD ["/opt/docker/customer-relationship-adapter-application"]