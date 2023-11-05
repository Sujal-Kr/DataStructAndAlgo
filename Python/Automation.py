import pywhatkit as kit
import time

# Define the recipient's phone number (with country code)
phone_number = "+918271243130"  # Replace with the recipient's phone number

# Define the message to send
message = "You have been hacked."

# Specify the time at which to send the message (24-hour format, e.g., "HH:MM")
message_time = "12:07"

# Loop to send the message five times
for i in range(5):
    # Calculate the time delay until the message is sent
    current_time = time.localtime()
    scheduled_time = time.strptime(message_time, "%H:%M")
    time_delay = 0.001

    if time_delay > 0:
        print(f"Waiting for {time_delay} seconds before sending the message...")
        time.sleep(time_delay)

    # Send the message
    kit.sendwhatmsg(phone_number, message, current_time.tm_hour, current_time.tm_min + 1)
    print(f"Message {i + 1} sent at {time.strftime('%H:%M:%S')}")
