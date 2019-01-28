ARG JAVA_VERSION=8u181
ARG SCALA_VERSION=2.12.8
ARG SBT_VERSION=1.2.8

FROM hseeberger/scala-sbt:${JAVA_VERSION}_${SCALA_VERSION}_${SBT_VERSION}

ENV HEROKU_API_KEY=changeme

RUN	apt update \
	&& apt upgrade --yes \
	&& curl https://cli-assets.heroku.com/install.sh | sh \
	&& mkdir /root/code

VOLUME /root/code

# RUN curl -L https://packages.gitlab.com/install/repositories/runner/gitlab-runner/script.deb.sh | bash \
#	&& apt install gitlab-runner --yes --allow-unauthenticated \
#	&& gitlab-runner stop \
#	&& gitlab-runner uninstall \
#	&& gitlab-runner install --user root \
#	&& gitlab-runner start

COPY example /root/example
RUN cd /root/example \
	&& bash run-all




