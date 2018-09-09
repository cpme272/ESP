# Lab01

## Introduction
In this lab, we will achieve following:

* Install Ansible

* Configure Ansible

* Install http server

* Deploy Hello World Html Page

* Access the website

### Install Anisble
Ansible can be installed from [Ansible Github Repo](https://github.com/ansible/ansible) on your x86_64 machine. You can use following command:

     git clone git://github.com/ansible/ansible.git --recursive
     cd ./ansible
     make rpm
     sudo rpm -Uvh ./rpm-build/ansible-*.noarch.rpm

For details, please follow the instruction given in Readme of Ansible.

### Configure Ansible

Identify the machine which you want to use for webserver and want to deploy hello world html page. Gather the details of hostname, ssh keys and remote user. You need to   Execute following steps:

##### Configure Inventory file
Create a directory where your you will keep all the lab01 files. In this example, it is lab01.
create a host inventory file under lab01 directory. It will have following contents:

	[webserver]
	webserver.example.com

#### Configure ansible.cfg
Create .ansible.cfg under your $HOME directory and it will have following contents:

	[defaults]
	remote_user = opc
	private_key_file = /home/psaini2018/cloud_keys/cloud_keys

You can also keep ansible.cfg in lab01 and ansible will use the same to check common properties.

Change the above configuration based on your environment.

### Install Http Server

Copy install_webserver.yaml file under lab01 and modify the content based on your requirement. By default, it will install and start http server.

Execute following command:

	ansible-playbook -i hosts install_webserver.yaml
   
You should see success message.

### Deploy Hello World Html Page
Copy install_webpage.yaml file under lab01 and modify the content based on your requirement. 

	ansible-playbook -i hosts install_webpage.yaml

### Access the website
You can access the page with following command:

	http://webserver.example.com:80/

	or

	https://webserver.example.com:443/
### Deinstall webserver
you can ddeinstall webserver	
	ansible-playbook -i hosts deinstall_webserver.yaml
