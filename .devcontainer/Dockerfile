# 使用官方 Ubuntu 作为基础
FROM ubuntu:22.04

# 避免交互式安装提示
ENV DEBIAN_FRONTEND=noninteractive

# 安装必要工具
RUN apt-get update && \
    apt-get install -y \
        openjdk-11-jdk \
        maven \
        git \
        curl \
        wget \
        unzip \
        vim \
        bash-completion && \
    apt-get clean && \
    rm -rf /var/lib/apt/lists/*

# 设置 JAVA_HOME
ENV JAVA_HOME=/usr/lib/jvm/java-11-openjdk-amd64
ENV PATH=$JAVA_HOME/bin:$PATH

# 验证安装
RUN java -version && mvn -v
