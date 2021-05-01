# Emailer

Simple public API for sending emails.

This project is extremely simple 
and for educational use only.

# Endpoints

Send an e-mail message:
```http
    POST /api/v1/send
```

# Environmental variables

If you plan to run it locally
then you have to define these:

- MAIL_HOST - url to the SMTP server
- MAIL_USERNAME - username for the SMTP server
- MAIL_PASSWORD - password for the SMTP server

You can do it in an .env file
or in your IDE of choice e.g. IntelliJ IDEA.