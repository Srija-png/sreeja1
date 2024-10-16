class Colourr {
    def _init_(self, red, green, blue):
        self.red = red
        self.green = green
        self.blue = blue

    def get_hue(self):
        max_val = max(self.red, self.green, self.blue)
        min_val = min(self.red, self.green, self.blue)
        delta = max_val - min_val

        if delta == 0:
            return 0

        if max_val == self.red:
            hue = ((self.green - self.blue) / delta) % 6
        elif max_val == self.green:
            hue = ((self.blue - self.red) / delta) + 2
        else:
            hue = ((self.red - self.green) / delta) + 4

        hue *= 60
        return hue

    def get_saturation(self):
        max_val = max(self.red, self.green, self.blue)
        min_val = min(self.red, self.green, self.blue)

        if max_val == 0:
            return 0

        saturation = (max_val - min_val) / max_val
        return saturation

    def get_brightness(self):
        return max(self.red, self.green, self.blue) / 255

# Define the color with RGB values
red = 193
green = 255
blue = 183

# Create an instance of the ColourChecking class
color = ColourChecking(red, green, blue)

# Calculate and print the Hue, Saturation, and Brightness of the color
hue = color.get_hue()
saturation = color.get_saturation()
brightness = color.get_brightness()

print("Hue:", hue)
print("Saturation:", saturation)
print("Brightness:", brightness)