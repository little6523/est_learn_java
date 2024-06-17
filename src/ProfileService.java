public class ProfileService {
    ProfileRepository profileRepository;

    public void saveProfile(ProfileRepository profileRepository) {
        profileRepository.save();
    }
}
